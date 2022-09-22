package com.company.gaz.web.docanexcerrac;

import com.google.common.collect.Sets;
import com.haulmont.cuba.core.app.FileStorageService;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.global.FileStorageException;
import com.haulmont.cuba.gui.components.*;
import com.company.gaz.entity.DocAnexCerRac;
import com.haulmont.cuba.gui.data.DataSupplier;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.cuba.gui.export.ExportDisplay;
import com.haulmont.cuba.gui.export.ExportFormat;
import com.haulmont.cuba.gui.export.FileDataProvider;
import com.haulmont.cuba.gui.upload.FileUploadingAPI;

import javax.inject.Inject;
import java.io.ByteArrayInputStream;
import java.util.Map;

public class DocAnexCerRacEdit extends AbstractEditor<DocAnexCerRac> {

    @Inject
    private FileUploadField uploadFisierDocument;

    @Inject
    private DataSupplier dataSupplier;

    @Inject
    private FileUploadingAPI fileUploadingAPI;

    @Inject
    private Button clearPdfBtn;

    @Inject
    private Button downloadPdfBtn;

    @Inject
    private Embedded preview;

    @Inject
    private ExportDisplay exportDisplay;

    @Inject
    private Datasource<DocAnexCerRac> docAnexCerRacDs;

    @Inject
    private FileStorageService fileStorageService;
    

    @Override
    public void init(Map<String, Object> params){

        uploadFisierDocument.setPermittedExtensions(Sets.newHashSet(".pdf"));

        uploadFisierDocument.addFileUploadSucceedListener(event -> {
            FileDescriptor fd = uploadFisierDocument.getFileDescriptor();
            try {
                fileUploadingAPI.putFileIntoStorage(uploadFisierDocument.getFileId(), fd);
            } catch (FileStorageException e) {
                throw new RuntimeException("Eroare la salvarea fișierului în File Storage", e);
            }
            getItem().setFisierDocument(dataSupplier.commit(fd));
            displayPdf();
        });

        uploadFisierDocument.addFileUploadErrorListener(event -> {
            showNotification("Eroare la încărcarea fișierului", NotificationType.HUMANIZED);
        });

        docAnexCerRacDs.addItemPropertyChangeListener(e ->  {
            if ("fisierDocument".equals(e.getProperty()))
                updatePdfButtons(e.getValue() != null);
        });

    }

    @Override
    protected void postInit() {
        displayPdf();
        updatePdfButtons(getItem().getFisierDocument() != null);
    }

    public void onClearPdfBtnClick() {
        getItem().setFisierDocument(null);
        displayPdf();
    }

    public void onDownloadPdfBtnClick() {
        if (getItem().getFisierDocument() != null)
            exportDisplay.show(getItem().getFisierDocument(), ExportFormat.OCTET_STREAM);
    }

    private void updatePdfButtons(boolean enable) {
        downloadPdfBtn.setEnabled(enable);
        clearPdfBtn.setEnabled(enable);
    }

    private void displayPdf() {
        if (getItem().getFisierDocument() != null) {
            FileDescriptor attachmentFile = getItem().getFisierDocument();
            preview.setSource(String.format("%s.pdf", attachmentFile.getUuid()), new FileDataProvider(attachmentFile));
//            preview.setSource(attachmentFile.getName(), new FileDataProvider(attachmentFile));
            preview.setType(Embedded.Type.BROWSER);
            preview.setVisible(true);
        }
        else
        {
            preview.setVisible(false);
        }
    }
}
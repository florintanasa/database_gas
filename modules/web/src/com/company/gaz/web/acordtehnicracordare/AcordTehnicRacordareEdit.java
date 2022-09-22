package com.company.gaz.web.acordtehnicracordare;

import com.google.common.collect.Sets;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.global.FileStorageException;
import com.haulmont.cuba.gui.components.*;
import com.company.gaz.entity.AcordTehnicRacordare;
import com.haulmont.cuba.gui.data.DataSupplier;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.cuba.gui.export.ExportDisplay;
import com.haulmont.cuba.gui.export.ExportFormat;
import com.haulmont.cuba.gui.upload.FileUploadingAPI;

import javax.inject.Inject;
import java.util.Map;

public class AcordTehnicRacordareEdit extends AbstractEditor<AcordTehnicRacordare> {

    @Inject
    private DataSupplier dataSupplier;

    @Inject
    private FileUploadingAPI fileUploadingAPI;

    @Inject
    private ExportDisplay exportDisplay;

    @Inject
    private FileUploadField imaginesolutieUpload;

    @Inject
    private Button downloadImageBtn;

    @Inject
    private Button clearImageBtn;

    @Inject
    private Datasource<AcordTehnicRacordare> acordTehnicRacordareDs;

    @Inject
    private Image imaginesolutie;

    @Override
    public void init(Map<String, Object> params){

        imaginesolutieUpload.setPermittedExtensions(Sets.newHashSet(".jpg",".png",".jpeg"));
        imaginesolutieUpload.addFileUploadSucceedListener(event -> {
            FileDescriptor fd = imaginesolutieUpload.getFileDescriptor();
            try {
                fileUploadingAPI.putFileIntoStorage(imaginesolutieUpload.getFileId(), fd);
            } catch (FileStorageException e) {
                throw new RuntimeException("Eroare la salvarea fișierului în FileStorage", e);
            }
            getItem().setImagineSolutie(dataSupplier.commit(fd));
            displayImage();
        });
        imaginesolutieUpload.addFileUploadErrorListener(event ->
                showNotification("Eroare la încărcare", NotificationType.HUMANIZED));
        acordTehnicRacordareDs.addItemPropertyChangeListener(e -> {
            if ("imagineSolutie".equals(e.getProperty()))
                updateImageButtons(e.getValue() != null);
        });
    }

    @Override
    protected void postInit(){
    displayImage();
    updateImageButtons(getItem().getImagineSolutie() != null);
    }

    public void onDownloadImageBtnClick() {
        if (getItem().getImagineSolutie() != null)
            exportDisplay.show(getItem().getImagineSolutie(), ExportFormat.OCTET_STREAM);
    }

    public void onClearImageBtnClick() {
        getItem().setImagineSolutie(null);
        displayImage();
    }

    private void updateImageButtons(boolean enable) {
        downloadImageBtn.setEnabled(enable);
        clearImageBtn.setEnabled(enable);
    }

    private void displayImage(){
        if (getItem().getImagineSolutie() !=null){
            imaginesolutie.setSource(FileDescriptorResource.class).setFileDescriptor(getItem().getImagineSolutie());
            imaginesolutie.setVisible(true);
        }
        else
        {
            imaginesolutie.setVisible(false);
        }
    }
}
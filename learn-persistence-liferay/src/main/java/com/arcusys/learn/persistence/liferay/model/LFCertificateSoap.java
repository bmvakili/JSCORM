package com.arcusys.learn.persistence.liferay.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
* This class is used by SOAP remote services.
*
* @author    Brian Wing Shun Chan
* @generated
*/
public class LFCertificateSoap implements Serializable {
    private long _id;
    private String _title;
    private String _description;

    public LFCertificateSoap() {
    }

    public static LFCertificateSoap toSoapModel(LFCertificate model) {
        LFCertificateSoap soapModel = new LFCertificateSoap();

        soapModel.setId(model.getId());
        soapModel.setTitle(model.getTitle());
        soapModel.setDescription(model.getDescription());

        return soapModel;
    }

    public static LFCertificateSoap[] toSoapModels(LFCertificate[] models) {
        LFCertificateSoap[] soapModels = new LFCertificateSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static LFCertificateSoap[][] toSoapModels(LFCertificate[][] models) {
        LFCertificateSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new LFCertificateSoap[models.length][models[0].length];
        } else {
            soapModels = new LFCertificateSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static LFCertificateSoap[] toSoapModels(List<LFCertificate> models) {
        List<LFCertificateSoap> soapModels = new ArrayList<LFCertificateSoap>(models.size());

        for (LFCertificate model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new LFCertificateSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long pk) {
        setId(pk);
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }
}

package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFQuestion;
import com.arcusys.learn.persistence.liferay.model.LFQuestionModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
* The base model implementation for the LFQuestion service. Represents a row in the &quot;Learn_LFQuestion&quot; database table, with each column mapped to a property of this class.
*
* <p>
    * This implementation and its corresponding interface {@link com.arcusys.learn.persistence.liferay.model.LFQuestionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFQuestionImpl}.
    * </p>
*
* @author Brian Wing Shun Chan
* @see LFQuestionImpl
* @see com.arcusys.learn.persistence.liferay.model.LFQuestion
* @see com.arcusys.learn.persistence.liferay.model.LFQuestionModel
* @generated
*/
public class LFQuestionModelImpl extends BaseModelImpl<LFQuestion>
    implements LFQuestionModel {
    /*
    * NOTE FOR DEVELOPERS:
    *
    * Never modify or reference this class directly. All methods that expect a l f question model instance should use the {@link com.arcusys.learn.persistence.liferay.model.LFQuestion} interface instead.
    */
    public static final String TABLE_NAME = "Learn_LFQuestion";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "categoryId", Types.INTEGER },
            { "title", Types.CLOB },
            { "description", Types.CLOB },
            { "explanationText", Types.CLOB },
            { "forceCorrectCount", Types.BOOLEAN },
            { "caseSensitive", Types.BOOLEAN },
            { "questionType", Types.INTEGER },
            { "courseId", Types.INTEGER },
            { "arrangementIndex", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table Learn_LFQuestion (id_ LONG not null primary key,categoryId INTEGER null,title TEXT null,description TEXT null,explanationText TEXT null,forceCorrectCount BOOLEAN,caseSensitive BOOLEAN,questionType INTEGER,courseId INTEGER null,arrangementIndex INTEGER)";
    public static final String TABLE_SQL_DROP = "drop table Learn_LFQuestion";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFQuestion"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFQuestion"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.arcusys.learn.persistence.liferay.model.LFQuestion"),
            true);
    public static long CATEGORYID_COLUMN_BITMASK = 1L;
    public static long COURSEID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.arcusys.learn.persistence.liferay.model.LFQuestion"));
    private static ClassLoader _classLoader = LFQuestion.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            LFQuestion.class
        };
    private long _id;
    private Integer _categoryId;
    private Integer _originalCategoryId;
    private boolean _setOriginalCategoryId;
    private String _title;
    private String _description;
    private String _explanationText;
    private boolean _forceCorrectCount;
    private boolean _caseSensitive;
    private Integer _questionType;
    private Integer _courseId;
    private Integer _originalCourseId;
    private boolean _setOriginalCourseId;
    private Integer _arrangementIndex;
    private long _columnBitmask;
    private LFQuestion _escapedModelProxy;

    public LFQuestionModelImpl() {
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_id);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    public Class<?> getModelClass() {
        return LFQuestion.class;
    }

    public String getModelClassName() {
        return LFQuestion.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("categoryId", getCategoryId());
        attributes.put("title", getTitle());
        attributes.put("description", getDescription());
        attributes.put("explanationText", getExplanationText());
        attributes.put("forceCorrectCount", getForceCorrectCount());
        attributes.put("caseSensitive", getCaseSensitive());
        attributes.put("questionType", getQuestionType());
        attributes.put("courseId", getCourseId());
        attributes.put("arrangementIndex", getArrangementIndex());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Integer categoryId = (Integer) attributes.get("categoryId");

        if (categoryId != null) {
            setCategoryId(categoryId);
        }

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        String explanationText = (String) attributes.get("explanationText");

        if (explanationText != null) {
            setExplanationText(explanationText);
        }

        Boolean forceCorrectCount = (Boolean) attributes.get(
                "forceCorrectCount");

        if (forceCorrectCount != null) {
            setForceCorrectCount(forceCorrectCount);
        }

        Boolean caseSensitive = (Boolean) attributes.get("caseSensitive");

        if (caseSensitive != null) {
            setCaseSensitive(caseSensitive);
        }

        Integer questionType = (Integer) attributes.get("questionType");

        if (questionType != null) {
            setQuestionType(questionType);
        }

        Integer courseId = (Integer) attributes.get("courseId");

        if (courseId != null) {
            setCourseId(courseId);
        }

        Integer arrangementIndex = (Integer) attributes.get("arrangementIndex");

        if (arrangementIndex != null) {
            setArrangementIndex(arrangementIndex);
        }
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public Integer getCategoryId() {
        return _categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        _columnBitmask |= CATEGORYID_COLUMN_BITMASK;

        if (!_setOriginalCategoryId) {
            _setOriginalCategoryId = true;

            _originalCategoryId = _categoryId;
        }

        _categoryId = categoryId;
    }

    public Integer getOriginalCategoryId() {
        return _originalCategoryId;
    }

    public String getTitle() {
        if (_title == null) {
            return StringPool.BLANK;
        } else {
            return _title;
        }
    }

    public void setTitle(String title) {
        _title = title;
    }

    public String getDescription() {
        if (_description == null) {
            return StringPool.BLANK;
        } else {
            return _description;
        }
    }

    public void setDescription(String description) {
        _description = description;
    }

    public String getExplanationText() {
        if (_explanationText == null) {
            return StringPool.BLANK;
        } else {
            return _explanationText;
        }
    }

    public void setExplanationText(String explanationText) {
        _explanationText = explanationText;
    }

    public boolean getForceCorrectCount() {
        return _forceCorrectCount;
    }

    public boolean isForceCorrectCount() {
        return _forceCorrectCount;
    }

    public void setForceCorrectCount(boolean forceCorrectCount) {
        _forceCorrectCount = forceCorrectCount;
    }

    public boolean getCaseSensitive() {
        return _caseSensitive;
    }

    public boolean isCaseSensitive() {
        return _caseSensitive;
    }

    public void setCaseSensitive(boolean caseSensitive) {
        _caseSensitive = caseSensitive;
    }

    public Integer getQuestionType() {
        return _questionType;
    }

    public void setQuestionType(Integer questionType) {
        _questionType = questionType;
    }

    public Integer getCourseId() {
        return _courseId;
    }

    public void setCourseId(Integer courseId) {
        _columnBitmask |= COURSEID_COLUMN_BITMASK;

        if (!_setOriginalCourseId) {
            _setOriginalCourseId = true;

            _originalCourseId = _courseId;
        }

        _courseId = courseId;
    }

    public Integer getOriginalCourseId() {
        return _originalCourseId;
    }

    public Integer getArrangementIndex() {
        return _arrangementIndex;
    }

    public void setArrangementIndex(Integer arrangementIndex) {
        _arrangementIndex = arrangementIndex;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            LFQuestion.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public LFQuestion toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (LFQuestion) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public Object clone() {
        LFQuestionImpl lfQuestionImpl = new LFQuestionImpl();

        lfQuestionImpl.setId(getId());
        lfQuestionImpl.setCategoryId(getCategoryId());
        lfQuestionImpl.setTitle(getTitle());
        lfQuestionImpl.setDescription(getDescription());
        lfQuestionImpl.setExplanationText(getExplanationText());
        lfQuestionImpl.setForceCorrectCount(getForceCorrectCount());
        lfQuestionImpl.setCaseSensitive(getCaseSensitive());
        lfQuestionImpl.setQuestionType(getQuestionType());
        lfQuestionImpl.setCourseId(getCourseId());
        lfQuestionImpl.setArrangementIndex(getArrangementIndex());

        lfQuestionImpl.resetOriginalValues();

        return lfQuestionImpl;
    }

    public int compareTo(LFQuestion lfQuestion) {
        long primaryKey = lfQuestion.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        LFQuestion lfQuestion = null;

        try {
            lfQuestion = (LFQuestion) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = lfQuestion.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        LFQuestionModelImpl lfQuestionModelImpl = this;

        lfQuestionModelImpl._originalCategoryId = lfQuestionModelImpl._categoryId;

        lfQuestionModelImpl._setOriginalCategoryId = false;

        lfQuestionModelImpl._originalCourseId = lfQuestionModelImpl._courseId;

        lfQuestionModelImpl._setOriginalCourseId = false;

        lfQuestionModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<LFQuestion> toCacheModel() {
        LFQuestionCacheModel lfQuestionCacheModel = new LFQuestionCacheModel();

        lfQuestionCacheModel.id = getId();

        lfQuestionCacheModel.categoryId = getCategoryId();

        lfQuestionCacheModel.title = getTitle();

        String title = lfQuestionCacheModel.title;

        if ((title != null) && (title.length() == 0)) {
            lfQuestionCacheModel.title = null;
        }

        lfQuestionCacheModel.description = getDescription();

        String description = lfQuestionCacheModel.description;

        if ((description != null) && (description.length() == 0)) {
            lfQuestionCacheModel.description = null;
        }

        lfQuestionCacheModel.explanationText = getExplanationText();

        String explanationText = lfQuestionCacheModel.explanationText;

        if ((explanationText != null) && (explanationText.length() == 0)) {
            lfQuestionCacheModel.explanationText = null;
        }

        lfQuestionCacheModel.forceCorrectCount = getForceCorrectCount();

        lfQuestionCacheModel.caseSensitive = getCaseSensitive();

        lfQuestionCacheModel.questionType = getQuestionType();

        lfQuestionCacheModel.courseId = getCourseId();

        lfQuestionCacheModel.arrangementIndex = getArrangementIndex();

        return lfQuestionCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", categoryId=");
        sb.append(getCategoryId());
        sb.append(", title=");
        sb.append(getTitle());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", explanationText=");
        sb.append(getExplanationText());
        sb.append(", forceCorrectCount=");
        sb.append(getForceCorrectCount());
        sb.append(", caseSensitive=");
        sb.append(getCaseSensitive());
        sb.append(", questionType=");
        sb.append(getQuestionType());
        sb.append(", courseId=");
        sb.append(getCourseId());
        sb.append(", arrangementIndex=");
        sb.append(getArrangementIndex());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("com.arcusys.learn.persistence.liferay.model.LFQuestion");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>categoryId</column-name><column-value><![CDATA[");
        sb.append(getCategoryId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>title</column-name><column-value><![CDATA[");
        sb.append(getTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>explanationText</column-name><column-value><![CDATA[");
        sb.append(getExplanationText());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>forceCorrectCount</column-name><column-value><![CDATA[");
        sb.append(getForceCorrectCount());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>caseSensitive</column-name><column-value><![CDATA[");
        sb.append(getCaseSensitive());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>questionType</column-name><column-value><![CDATA[");
        sb.append(getQuestionType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>courseId</column-name><column-value><![CDATA[");
        sb.append(getCourseId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>arrangementIndex</column-name><column-value><![CDATA[");
        sb.append(getArrangementIndex());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}

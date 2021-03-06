package com.arcusys.learn.persistence.liferay.service.persistence;

import com.arcusys.learn.persistence.liferay.model.LFRollupContribution;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the l f rollup contribution service. This utility wraps {@link LFRollupContributionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFRollupContributionPersistence
 * @see LFRollupContributionPersistenceImpl
 * @generated
 */
public class LFRollupContributionUtil {
    private static LFRollupContributionPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(LFRollupContribution lfRollupContribution) {
        getPersistence().clearCache(lfRollupContribution);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<LFRollupContribution> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<LFRollupContribution> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<LFRollupContribution> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
     */
    public static LFRollupContribution update(
        LFRollupContribution lfRollupContribution, boolean merge)
        throws SystemException {
        return getPersistence().update(lfRollupContribution, merge);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
     */
    public static LFRollupContribution update(
        LFRollupContribution lfRollupContribution, boolean merge,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence()
                   .update(lfRollupContribution, merge, serviceContext);
    }

    /**
    * Caches the l f rollup contribution in the entity cache if it is enabled.
    *
    * @param lfRollupContribution the l f rollup contribution
    */
    public static void cacheResult(
        com.arcusys.learn.persistence.liferay.model.LFRollupContribution lfRollupContribution) {
        getPersistence().cacheResult(lfRollupContribution);
    }

    /**
    * Caches the l f rollup contributions in the entity cache if it is enabled.
    *
    * @param lfRollupContributions the l f rollup contributions
    */
    public static void cacheResult(
        java.util.List<com.arcusys.learn.persistence.liferay.model.LFRollupContribution> lfRollupContributions) {
        getPersistence().cacheResult(lfRollupContributions);
    }

    /**
    * Creates a new l f rollup contribution with the primary key. Does not add the l f rollup contribution to the database.
    *
    * @param id the primary key for the new l f rollup contribution
    * @return the new l f rollup contribution
    */
    public static com.arcusys.learn.persistence.liferay.model.LFRollupContribution create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the l f rollup contribution with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f rollup contribution
    * @return the l f rollup contribution that was removed
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFRollupContributionException if a l f rollup contribution with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFRollupContribution remove(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFRollupContributionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(id);
    }

    public static com.arcusys.learn.persistence.liferay.model.LFRollupContribution updateImpl(
        com.arcusys.learn.persistence.liferay.model.LFRollupContribution lfRollupContribution,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(lfRollupContribution, merge);
    }

    /**
    * Returns the l f rollup contribution with the primary key or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFRollupContributionException} if it could not be found.
    *
    * @param id the primary key of the l f rollup contribution
    * @return the l f rollup contribution
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFRollupContributionException if a l f rollup contribution with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFRollupContribution findByPrimaryKey(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFRollupContributionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the l f rollup contribution with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the l f rollup contribution
    * @return the l f rollup contribution, or <code>null</code> if a l f rollup contribution with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFRollupContribution fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns the l f rollup contribution where sequencingID = &#63; or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFRollupContributionException} if it could not be found.
    *
    * @param sequencingID the sequencing i d
    * @return the matching l f rollup contribution
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFRollupContributionException if a matching l f rollup contribution could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFRollupContribution findBySequencingID(
        java.lang.Integer sequencingID)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFRollupContributionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBySequencingID(sequencingID);
    }

    /**
    * Returns the l f rollup contribution where sequencingID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param sequencingID the sequencing i d
    * @return the matching l f rollup contribution, or <code>null</code> if a matching l f rollup contribution could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFRollupContribution fetchBySequencingID(
        java.lang.Integer sequencingID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBySequencingID(sequencingID);
    }

    /**
    * Returns the l f rollup contribution where sequencingID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param sequencingID the sequencing i d
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching l f rollup contribution, or <code>null</code> if a matching l f rollup contribution could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFRollupContribution fetchBySequencingID(
        java.lang.Integer sequencingID, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBySequencingID(sequencingID, retrieveFromCache);
    }

    /**
    * Returns all the l f rollup contributions.
    *
    * @return the l f rollup contributions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFRollupContribution> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the l f rollup contributions.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f rollup contributions
    * @param end the upper bound of the range of l f rollup contributions (not inclusive)
    * @return the range of l f rollup contributions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFRollupContribution> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the l f rollup contributions.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f rollup contributions
    * @param end the upper bound of the range of l f rollup contributions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of l f rollup contributions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFRollupContribution> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes the l f rollup contribution where sequencingID = &#63; from the database.
    *
    * @param sequencingID the sequencing i d
    * @return the l f rollup contribution that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFRollupContribution removeBySequencingID(
        java.lang.Integer sequencingID)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFRollupContributionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeBySequencingID(sequencingID);
    }

    /**
    * Removes all the l f rollup contributions from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of l f rollup contributions where sequencingID = &#63;.
    *
    * @param sequencingID the sequencing i d
    * @return the number of matching l f rollup contributions
    * @throws SystemException if a system exception occurred
    */
    public static int countBySequencingID(java.lang.Integer sequencingID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBySequencingID(sequencingID);
    }

    /**
    * Returns the number of l f rollup contributions.
    *
    * @return the number of l f rollup contributions
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static LFRollupContributionPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (LFRollupContributionPersistence) PortletBeanLocatorUtil.locate(com.arcusys.learn.persistence.liferay.service.ClpSerializer.getServletContextName(),
                    LFRollupContributionPersistence.class.getName());

            ReferenceRegistry.registerReference(LFRollupContributionUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated
     */
    public void setPersistence(LFRollupContributionPersistence persistence) {
    }
}

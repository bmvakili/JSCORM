package com.arcusys.learn.scorm.course.impl.liferay

import com.arcusys.learn.storage.impl.EntityStorage
import com.arcusys.learn.persistence.liferay.service.LFCourseLocalServiceUtil
import com.arcusys.learn.persistence.liferay.model.LFCourse
import scala._
import com.arcusys.learn.scorm.tracking.model.Course


/**
 * Created with IntelliJ IDEA.
 * User: Yulia.Glushonkova
 * Date: 26.03.13
 */
trait LFCourseStorageImpl extends EntityStorage[Course] {
  protected def doRenew() { LFCourseLocalServiceUtil.removeAll()}

  def modify(entity: Course, parameters: (String, Any)*) {
    val lfEntity = LFCourseLocalServiceUtil.findByCourseIdAndUserId(entity.courseID, entity.userID)
     doUpdate(entity, lfEntity, LFCourseLocalServiceUtil.updateLFCourse(_))
  }

  def create(entity: Course, parameters: (String, Any)*) {
    doUpdate(entity, LFCourseLocalServiceUtil.createLFCourse(), LFCourseLocalServiceUtil.addLFCourse(_))
  }

  def getOne(parameters: (String, Any)*) = {
    parameters match {
      case Seq(a: (String, Int), b: (String, Int)) if Set(a._1, b._1) == Set("courseID", "userID") => {
        val courseId: Int = parameters.find(_._1 == "courseID").map { _._2.asInstanceOf[Int] }.get
        val userID: Int = parameters.find(_._1 == "userID").map { _._2.asInstanceOf[Int] }.get

        extract(LFCourseLocalServiceUtil.fetchByCourseIdAndUserId(courseId, userID))
      }
    }
  }
  def extract(lfEntity: LFCourse): Option[Course] =
    if (lfEntity == null) None
    else Option(Course(lfEntity.getCourseID, lfEntity.getUserID, lfEntity.getGrade, lfEntity.getComment))

  def getAll(parameters: (String, Any)*) = { throw new UnsupportedOperationException("Not implemented") }
  def create(parameters: (String, Any)*) { throw new UnsupportedOperationException("Not implemented") }
  def delete(parameters: (String, Any)*) { throw new UnsupportedOperationException("Not implemented") }
  def modify(parameters: (String, Any)*) { throw new UnsupportedOperationException("Not implemented") }

  def doUpdate(entity: Course, newEntity: LFCourse, updateFunction: (LFCourse) => LFCourse): LFCourse= {
    newEntity.setCourseID(entity.courseID)
    newEntity.setUserID(entity.userID)
    newEntity.setGrade(entity.grade)
    newEntity.setComment(entity.comment)

    updateFunction(newEntity)
  }

  def execute(sqlKey: String, parameters: (String, Any)*) {
    throw new UnsupportedOperationException
  }

  def getAll(sqlKey: String, parameters: (String, Any)*) = throw new UnsupportedOperationException

  def getOne(sqlKey: String, parameters: (String, Any)*) = throw new UnsupportedOperationException

  def modify(sqlKey: String, parameters: (String, Any)*) {
    throw new UnsupportedOperationException
  }
}

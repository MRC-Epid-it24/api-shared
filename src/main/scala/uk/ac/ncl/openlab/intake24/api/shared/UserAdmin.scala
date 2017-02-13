package uk.ac.ncl.openlab.intake24.api.shared

case class DeleteUsersRequest(userNames: Seq[String])

case class UserRecordWithPermissions(userName: String, password: String, name: Option[String], email: Option[String], phone: Option[String], customFields: Map[String, String], roles: Set[String], permissions: Set[String])

case class CreateOrUpdateGlobalUsersRequest(userRecords: Seq[UserRecordWithPermissions])

case class CreateOrUpdateUsersRequest(userRecords: Seq[UserRecord])

case class UserRecord(userName: String, password: String, name: Option[String], email: Option[String], phone: Option[String], customFields: Map[String, String])

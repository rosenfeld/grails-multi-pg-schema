package pgschema

class CurrentUserSchemaFilters {

  def filters = {
    all(controller:'*', action:'*') {
      before = {
        User.withSession { session ->
          session.connection().prepareStatement(
            "SET search_path TO ${currentUser.current_user_schema},public").execute()
        }
        true
      }
    }
  }

  def getCurrentUser() {
    // simulate method:
    User.get(1)
  }
}

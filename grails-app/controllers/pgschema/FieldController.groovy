package pgschema

class FieldController {
  static scaffold = Field

  def chooseSchema(String schema) {
    def user = User.get(1)
    if (params.schema) {
      user.current_user_schema = schema
      user.save flush: true, failOnError: true
    }
    [schema: user.current_user_schema]
  }
}

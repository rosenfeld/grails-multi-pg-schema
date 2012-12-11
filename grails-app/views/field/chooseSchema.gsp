<!doctype html>
<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
  
    <title>Choose a Schema for current user</title>
  </head>
  <body>
    <g:form name="form" url="[action: 'chooseSchema']">
      <g:select name="schema" from="${['one', 'two']}" value="${schema}" />
      <g:submitButton name="change schema"/>
    </g:form>
  </body>
</html>

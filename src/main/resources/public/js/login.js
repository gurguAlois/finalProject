
$(document).ready(function(){
  // $("p.error > span").parent().prev().css({ "border": "1px solid red" });

  $("p.error > span").parent().prev().addClass("error");

  $("#password").focusout(validateConfirmPassword);
  $("#confirmPassword").focusout(validateConfirmPassword);



});
function validateConfirmPassword(){
  var passwordText = $("#password").val();
  var confirmPasswordText = $("#confirmPassword").val();
  if(confirmPasswordText.length == 0){
    return false;
  }

  if(passwordText !== confirmPasswordText){
    $("#confirmPassword").addClass("error").next("p.error")
    .html("<span>Passwords do not match</span>");
  } else {
    $("#confirmPassword").removeClass("error").next("p.error")
    .html("");
  }
}

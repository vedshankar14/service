$('.toggle').on('click', function() {
  $('.container').stop().addClass('active');
});

$('.close').on('click', function() {
  $('.container').stop().removeClass('active');
});

$('.button-container').on('click', function() {
  alert("Login usetr");
});

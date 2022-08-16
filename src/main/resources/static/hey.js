$(document).ready(function() {
    $.ajax({
              url: "/test"
          }).then(function(data) {
             $('.greeting-id').append(data.id);
             $('.greeting-content').append(data.content);
          });
          $("p").click(function(){
           $.ajax({
             type: "POST",
             url: "/test",
             dataType : 'json',
             contentType : "application/json",
             data: JSON.stringify({
                                               "id" : "2010"
                                               }),
             success: function(){alert('success')},
           });
          });
});




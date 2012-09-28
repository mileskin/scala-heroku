var MyApp = {}

MyApp.Module = (function($) {
  function init() {
    $('.foo').text('yay from js')
  }

  return {
    init: init
  }
}(jQuery))

$(document).ready(MyApp.Module.init)


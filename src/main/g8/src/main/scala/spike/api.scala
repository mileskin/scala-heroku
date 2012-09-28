package spike

import org.scalatra._
import scalate.ScalateSupport

class MyScalatraFilter extends ScalatraFilter with ScalateSupport {
  get("/") {
    html("foo")
  }

  private def html(template: String) = {
    contentType = "text/html"
    ssp("/WEB-INF/scalate/views/%s.ssp".format(template), "layout" -> "/WEB-INF/scalate/layouts/default.ssp")
  }
}


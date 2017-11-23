
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!doctype html>
<html>
    <head>
        <title>About Us Page</title>
        <style>
            h1 """),format.raw/*6.16*/("""{"""),format.raw/*6.17*/("""
                """),format.raw/*7.17*/("""color: red;
            """),format.raw/*8.13*/("""}"""),format.raw/*8.14*/("""
        """),format.raw/*9.9*/("""</style>
    </head>
    <body>
        <h1> About Us</h1>
    </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 23 11:05:35 GMT 2017
                  SOURCE: /home/wdd/webapps/HellowWorld/app/views/about.scala.html
                  HASH: 81fa1981fe2422551ed03280046e7210d57b991c
                  MATRIX: 1030->0|1159->102|1187->103|1231->120|1282->144|1310->145|1345->154
                  LINES: 33->1|38->6|38->6|39->7|40->8|40->8|41->9
                  -- GENERATED --
              */
          
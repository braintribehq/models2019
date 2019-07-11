/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTextStyleTextModel of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link TextIndent}, 
{@link TextAlign}, 
{@link TextDecoration}, 
{@link LetterSpacing}, 
{@link WordSpacing}, 
{@link TextTransform}, 
{@link LineHeight}, 

* It provides of then following operations (getters and setters)
{@link getTextIndent},
{@link getTextAlign},
{@link getTextDecoration},
{@link getLetterSpacing},
{@link getWordSpacing},
{@link getTextTransform},
{@link getLineHeight},
{@link setTextIndent},
{@link setTextAlign},
{@link setTextDecoration},
{@link setLetterSpacing},
{@link setWordSpacing},
{@link setTextTransform},
{@link setLineHeight},
 */

@Description("")

public interface IfcTextStyleTextModel extends GenericEntity, ifc4.IfcPresentationItem {

	EntityType<IfcTextStyleTextModel> T = EntityTypes.T(IfcTextStyleTextModel.class);

	/* Constants for each property name. */
	java.lang.String TextIndent = "TextIndent";
	java.lang.String TextAlign = "TextAlign";
	java.lang.String TextDecoration = "TextDecoration";
	java.lang.String LetterSpacing = "LetterSpacing";
	java.lang.String WordSpacing = "WordSpacing";
	java.lang.String TextTransform = "TextTransform";
	java.lang.String LineHeight = "LineHeight";

	@Description("")
	@Mandatory
	ifc4.IfcSizeSelect getTextIndent();
	void setTextIndent(ifc4.IfcSizeSelect TextIndent);
	@Description("")
	@Mandatory
	java.lang.String getTextAlign();
	void setTextAlign(java.lang.String TextAlign);
	@Description("")
	@Mandatory
	java.lang.String getTextDecoration();
	void setTextDecoration(java.lang.String TextDecoration);
	@Description("")
	@Mandatory
	ifc4.IfcSizeSelect getLetterSpacing();
	void setLetterSpacing(ifc4.IfcSizeSelect LetterSpacing);
	@Description("")
	@Mandatory
	ifc4.IfcSizeSelect getWordSpacing();
	void setWordSpacing(ifc4.IfcSizeSelect WordSpacing);
	@Description("")
	@Mandatory
	java.lang.String getTextTransform();
	void setTextTransform(java.lang.String TextTransform);
	@Description("")
	@Mandatory
	ifc4.IfcSizeSelect getLineHeight();
	void setLineHeight(ifc4.IfcSizeSelect LineHeight);
}

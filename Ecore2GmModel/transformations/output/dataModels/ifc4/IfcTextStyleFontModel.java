/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTextStyleFontModel of the Data Model iai.
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
{@link FontFamily}, 
{@link FontStyle}, 
{@link FontVariant}, 
{@link FontWeight}, 
{@link FontSize}, 

* It provides of then following operations (getters and setters)
{@link getFontFamily},
{@link getFontStyle},
{@link getFontVariant},
{@link getFontWeight},
{@link getFontSize},
{@link setFontFamily},
{@link setFontStyle},
{@link setFontVariant},
{@link setFontWeight},
{@link setFontSize},
 */

@Description("")

public interface IfcTextStyleFontModel extends GenericEntity, ifc4.IfcPreDefinedTextFont {

	EntityType<IfcTextStyleFontModel> T = EntityTypes.T(IfcTextStyleFontModel.class);

	/* Constants for each property name. */
	java.lang.String FontFamily = "FontFamily";
	java.lang.String FontStyle = "FontStyle";
	java.lang.String FontVariant = "FontVariant";
	java.lang.String FontWeight = "FontWeight";
	java.lang.String FontSize = "FontSize";

	@Description("")
	
	java.util.List<java.lang.String> getFontFamily();
	void setFontFamily(java.util.List<java.lang.String> FontFamily);

	@Description("")
	@Mandatory
	java.lang.String getFontStyle();
	void setFontStyle(java.lang.String FontStyle);
	@Description("")
	@Mandatory
	java.lang.String getFontVariant();
	void setFontVariant(java.lang.String FontVariant);
	@Description("")
	@Mandatory
	java.lang.String getFontWeight();
	void setFontWeight(java.lang.String FontWeight);
	@Description("")
	@Mandatory
	ifc4.IfcSizeSelect getFontSize();
	void setFontSize(ifc4.IfcSizeSelect FontSize);
}

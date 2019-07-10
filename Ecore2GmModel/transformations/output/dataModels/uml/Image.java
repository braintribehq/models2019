/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Image of the Data Model uml.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package uml;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link content}, 
{@link format}, 
{@link location}, 

* It provides of then following operations (getters and setters)
{@link getContent},
{@link getFormat},
{@link getLocation},
{@link setContent},
{@link setFormat},
{@link setLocation},
 */

@Description("Physical definition of a graphical image.<p>From package UML::Packages.</p>")

public interface Image extends GenericEntity, uml.Element {

	EntityType<Image> T = EntityTypes.T(Image.class);

	/* Constants for each property name. */
	java.lang.String content = "content";
	java.lang.String format = "format";
	java.lang.String location = "location";

	@Description("This contains the serialization of the image according to the format. The value could represent a bitmap, image such as a GIF file, or drawing 'instructions' using a standard such as Scalable Vector Graphic (SVG) (which is XML based).<p>From package UML::Packages.</p>")
	@Mandatory
	types.String getContent();
	void setContent(types.String content);
	@Description("This indicates the format of the content, which is how the string content should be interpreted. The following values are reserved: SVG, GIF, PNG, JPG, WMF, EMF, BMP. In addition the prefix 'MIME: ' is also reserved. This option can be used as an alternative to express the reserved values above, for example 'SVG' could instead be expressed as 'MIME: image/svg+xml'.<p>From package UML::Packages.</p>")
	@Mandatory
	types.String getFormat();
	void setFormat(types.String format);
	@Description("This contains a location that can be used by a tool to locate the image as an alternative to embedding it in the stereotype.<p>From package UML::Packages.</p>")
	@Mandatory
	types.String getLocation();
	void setLocation(types.String location);
}

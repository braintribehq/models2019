/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Stereotype of the Data Model uml.
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
{@link icon}, 
{@link profile}, 

* It provides of then following operations (getters and setters)
{@link getIcon},
{@link getProfile},
{@link setIcon},
{@link setProfile},
 */

@Description("A stereotype defines how an existing metaclass may be extended, and enables the use of platform or domain specific terminology or notation in place of, or in addition to, the ones used for the extended metaclass.<p>From package UML::Packages.</p>")

public interface Stereotype extends GenericEntity, uml.Class {

	EntityType<Stereotype> T = EntityTypes.T(Stereotype.class);

	/* Constants for each property name. */
	java.lang.String icon = "icon";
	java.lang.String profile = "profile";

	@Description("Stereotype can change the graphical appearance of the extended model element by using attached icons. When this association is not null, it references the location of the icon content to be displayed within diagrams presenting the extended model elements.<p>From package UML::Packages.</p>")
	
	java.util.List<uml.Image> getIcon();
	void setIcon(java.util.List<uml.Image> icon);

	@Description("The profile that directly or indirectly contains this stereotype.<p>From package UML::Packages.</p>")
	@Mandatory
	uml.Profile getProfile();
	void setProfile(uml.Profile profile);
}

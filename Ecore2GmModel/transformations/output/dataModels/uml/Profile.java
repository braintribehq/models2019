/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Profile of the Data Model uml.
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
{@link metaclassReference}, 
{@link metamodelReference}, 

* It provides of then following operations (getters and setters)
{@link getMetaclassReference},
{@link getMetamodelReference},
{@link setMetaclassReference},
{@link setMetamodelReference},
 */

@Description("A profile defines limited extensions to a reference metamodel with the purpose of adapting the metamodel to a specific platform or domain.<p>From package UML::Packages.</p>")

public interface Profile extends GenericEntity, uml.Package {

	EntityType<Profile> T = EntityTypes.T(Profile.class);

	/* Constants for each property name. */
	java.lang.String metaclassReference = "metaclassReference";
	java.lang.String metamodelReference = "metamodelReference";

	@Description("References a metaclass that may be extended.<p>From package UML::Packages.</p>")
	
	java.util.List<uml.Elementimport> getMetaclassReference();
	void setMetaclassReference(java.util.List<uml.Elementimport> metaclassReference);

	@Description("References a package containing (directly or indirectly) metaclasses that may be extended.<p>From package UML::Packages.</p>")
	
	java.util.List<uml.Packageimport> getMetamodelReference();
	void setMetamodelReference(java.util.List<uml.Packageimport> metamodelReference);

}

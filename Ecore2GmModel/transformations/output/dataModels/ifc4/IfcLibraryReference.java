/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcLibraryReference of the Data Model iai.
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
{@link Description}, 
{@link Language}, 
{@link ReferencedLibrary}, 
{@link LibraryRefForObjects}, 

* It provides of then following operations (getters and setters)
{@link getDescription},
{@link getLanguage},
{@link getReferencedLibrary},
{@link getLibraryRefForObjects},
{@link setDescription},
{@link setLanguage},
{@link setReferencedLibrary},
{@link setLibraryRefForObjects},
 */

@Description("")

public interface IfcLibraryReference extends GenericEntity, ifc4.IfcExternalReference, ifc4.IfcLibrarySelect {

	EntityType<IfcLibraryReference> T = EntityTypes.T(IfcLibraryReference.class);

	/* Constants for each property name. */
	java.lang.String Description = "Description";
	java.lang.String Language = "Language";
	java.lang.String ReferencedLibrary = "ReferencedLibrary";
	java.lang.String LibraryRefForObjects = "LibraryRefForObjects";

	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	@Mandatory
	java.lang.String getLanguage();
	void setLanguage(java.lang.String Language);
	@Description("")
	@Mandatory
	ifc4.IfcLibraryInformation getReferencedLibrary();
	void setReferencedLibrary(ifc4.IfcLibraryInformation ReferencedLibrary);
	@Description("")
	
	java.util.List<ifc4.IfcRelAssociatesLibrary> getLibraryRefForObjects();
	void setLibraryRefForObjects(java.util.List<ifc4.IfcRelAssociatesLibrary> LibraryRefForObjects);

}

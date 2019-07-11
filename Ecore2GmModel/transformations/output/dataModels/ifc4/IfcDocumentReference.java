/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcDocumentReference of the Data Model iai.
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
{@link ReferencedDocument}, 
{@link DocumentRefForObjects}, 

* It provides of then following operations (getters and setters)
{@link getDescription},
{@link getReferencedDocument},
{@link getDocumentRefForObjects},
{@link setDescription},
{@link setReferencedDocument},
{@link setDocumentRefForObjects},
 */

@Description("")

public interface IfcDocumentReference extends GenericEntity, ifc4.IfcExternalReference, ifc4.IfcDocumentSelect {

	EntityType<IfcDocumentReference> T = EntityTypes.T(IfcDocumentReference.class);

	/* Constants for each property name. */
	java.lang.String Description = "Description";
	java.lang.String ReferencedDocument = "ReferencedDocument";
	java.lang.String DocumentRefForObjects = "DocumentRefForObjects";

	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	@Mandatory
	ifc4.IfcDocumentInformation getReferencedDocument();
	void setReferencedDocument(ifc4.IfcDocumentInformation ReferencedDocument);
	@Description("")
	
	java.util.List<ifc4.IfcRelAssociatesDocument> getDocumentRefForObjects();
	void setDocumentRefForObjects(java.util.List<ifc4.IfcRelAssociatesDocument> DocumentRefForObjects);

}

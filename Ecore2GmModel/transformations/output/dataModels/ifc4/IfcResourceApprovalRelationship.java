/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcResourceApprovalRelationship of the Data Model iai.
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
{@link RelatedResourceObjects}, 
{@link RelatingApproval}, 

* It provides of then following operations (getters and setters)
{@link getRelatedResourceObjects},
{@link getRelatingApproval},
{@link setRelatedResourceObjects},
{@link setRelatingApproval},
 */

@Description("")

public interface IfcResourceApprovalRelationship extends GenericEntity, ifc4.IfcResourceLevelRelationship {

	EntityType<IfcResourceApprovalRelationship> T = EntityTypes.T(IfcResourceApprovalRelationship.class);

	/* Constants for each property name. */
	java.lang.String RelatedResourceObjects = "RelatedResourceObjects";
	java.lang.String RelatingApproval = "RelatingApproval";

	@Description("")
	
	java.util.List<ifc4.IfcResourceObjectSelect> getRelatedResourceObjects();
	void setRelatedResourceObjects(java.util.List<ifc4.IfcResourceObjectSelect> RelatedResourceObjects);

	@Description("")
	@Mandatory
	ifc4.IfcApproval getRelatingApproval();
	void setRelatingApproval(ifc4.IfcApproval RelatingApproval);
}

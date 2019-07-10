/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Collaboration of the Data Model uml.
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
{@link collaborationRole}, 

* It provides of then following operations (getters and setters)
{@link getCollaborationRole},
{@link setCollaborationRole},
 */

@Description("A Collaboration describes a structure of collaborating elements (roles), each performing a specialized function, which collectively accomplish some desired functionality.<p>From package UML::StructuredClassifiers.</p>")

public interface Collaboration extends GenericEntity, uml.Structuredclassifier, uml.Behavioredclassifier {

	EntityType<Collaboration> T = EntityTypes.T(Collaboration.class);

	/* Constants for each property name. */
	java.lang.String collaborationRole = "collaborationRole";

	@Description("Represents the participants in the Collaboration.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Connectableelement> getCollaborationRole();
	void setCollaborationRole(java.util.List<uml.Connectableelement> collaborationRole);

}

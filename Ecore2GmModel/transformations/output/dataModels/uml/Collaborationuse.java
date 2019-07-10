/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Collaborationuse of the Data Model uml.
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
{@link roleBinding}, 
{@link type}, 

* It provides of then following operations (getters and setters)
{@link getRoleBinding},
{@link getType},
{@link setRoleBinding},
{@link setType},
 */

@Description("A CollaborationUse is used to specify the application of a pattern specified by a Collaboration to a specific situation.<p>From package UML::StructuredClassifiers.</p>")

public interface Collaborationuse extends GenericEntity, uml.Namedelement {

	EntityType<Collaborationuse> T = EntityTypes.T(Collaborationuse.class);

	/* Constants for each property name. */
	java.lang.String roleBinding = "roleBinding";
	java.lang.String type = "type";

	@Description("A mapping between features of the Collaboration and features of the owning Classifier. This mapping indicates which ConnectableElement of the Classifier plays which role(s) in the Collaboration. A ConnectableElement may be bound to multiple roles in the same CollaborationUse (that is, it may play multiple roles).<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Dependency> getRoleBinding();
	void setRoleBinding(java.util.List<uml.Dependency> roleBinding);

	@Description("The Collaboration which is used in this CollaborationUse. The Collaboration defines the cooperation between its roles which are mapped to ConnectableElements relating to the Classifier owning the CollaborationUse.<p>From package UML::StructuredClassifiers.</p>")
	@Mandatory
	uml.Collaboration getType();
	void setType(uml.Collaboration type);
}

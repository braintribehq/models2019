/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Connectableelement of the Data Model uml.
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
{@link end}, 

* It provides of then following operations (getters and setters)
{@link getEnd},
{@link setEnd},
 */

@Description("ConnectableElement is an abstract metaclass representing a set of instances that play roles of a StructuredClassifier. ConnectableElements may be joined by attached Connectors and specify configurations of linked instances to be created within an instance of the containing StructuredClassifier.<p>From package UML::StructuredClassifiers.</p>")
 
@Abstract 

public interface Connectableelement extends GenericEntity, uml.Typedelement, uml.Parameterableelement {

	EntityType<Connectableelement> T = EntityTypes.T(Connectableelement.class);

	/* Constants for each property name. */
	java.lang.String end = "end";

	@Description("A set of ConnectorEnds that attach to this ConnectableElement.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Connectorend> getEnd();
	void setEnd(java.util.List<uml.Connectorend> end);

}

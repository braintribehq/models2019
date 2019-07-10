/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Node of the Data Model uml.
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
{@link nestedNode}, 

* It provides of then following operations (getters and setters)
{@link getNestedNode},
{@link setNestedNode},
 */

@Description("A Node is computational resource upon which artifacts may be deployed for execution. Nodes can be interconnected through communication paths to define network structures.<p>From package UML::Deployments.</p>")

public interface Node extends GenericEntity, uml.Class, uml.Deploymenttarget {

	EntityType<Node> T = EntityTypes.T(Node.class);

	/* Constants for each property name. */
	java.lang.String nestedNode = "nestedNode";

	@Description("The Nodes that are defined (nested) within the Node.<p>From package UML::Deployments.</p>")
	
	java.util.List<uml.Node> getNestedNode();
	void setNestedNode(java.util.List<uml.Node> nestedNode);

}

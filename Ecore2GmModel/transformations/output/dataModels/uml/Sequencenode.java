/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Sequencenode of the Data Model uml.
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
{@link executableNode}, 

* It provides of then following operations (getters and setters)
{@link getExecutableNode},
{@link setExecutableNode},
 */

@Description("A SequenceNode is a StructuredActivityNode that executes a sequence of ExecutableNodes in order.<p>From package UML::Actions.</p>")

public interface Sequencenode extends GenericEntity, uml.Structuredactivitynode {

	EntityType<Sequencenode> T = EntityTypes.T(Sequencenode.class);

	/* Constants for each property name. */
	java.lang.String executableNode = "executableNode";

	@Description("The ordered set of ExecutableNodes to be sequenced.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Executablenode> getExecutableNode();
	void setExecutableNode(java.util.List<uml.Executablenode> executableNode);

}

/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Structuredactivitynode of the Data Model uml.
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
{@link edge}, 
{@link mustIsolate}, 
{@link structuredNodeInput}, 
{@link structuredNodeOutput}, 
{@link variable}, 
{@link node}, 

* It provides of then following operations (getters and setters)
{@link getEdge},
{@link getMustIsolate},
{@link getStructuredNodeInput},
{@link getStructuredNodeOutput},
{@link getVariable},
{@link getNode},
{@link setEdge},
{@link setMustIsolate},
{@link setStructuredNodeInput},
{@link setStructuredNodeOutput},
{@link setVariable},
{@link setNode},
 */

@Description("A StructuredActivityNode is an Action that is also an ActivityGroup and whose behavior is specified by the ActivityNodes and ActivityEdges it so contains. Unlike other kinds of ActivityGroup, a StructuredActivityNode owns the ActivityNodes and ActivityEdges it contains, and so a node or edge can only be directly contained in one StructuredActivityNode, though StructuredActivityNodes may be nested.<p>From package UML::Actions.</p>")

public interface Structuredactivitynode extends GenericEntity, uml.Action, uml.Namespace, uml.Activitygroup {

	EntityType<Structuredactivitynode> T = EntityTypes.T(Structuredactivitynode.class);

	/* Constants for each property name. */
	java.lang.String edge = "edge";
	java.lang.String mustIsolate = "mustIsolate";
	java.lang.String structuredNodeInput = "structuredNodeInput";
	java.lang.String structuredNodeOutput = "structuredNodeOutput";
	java.lang.String variable = "variable";
	java.lang.String node = "node";

	@Description("The ActivityEdges immediately contained in the StructuredActivityNode.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Activityedge> getEdge();
	void setEdge(java.util.List<uml.Activityedge> edge);

	@Description("If true, then any object used by an Action within the StructuredActivityNode cannot be accessed by any Action outside the node until the StructuredActivityNode as a whole completes. Any concurrent Actions that would result in accessing such objects are required to have their execution deferred until the completion of the StructuredActivityNode.<p>From package UML::Actions.</p>")
	@Mandatory
	types.Boolean getMustIsolate();
	void setMustIsolate(types.Boolean mustIsolate);
	@Description("The InputPins owned by the StructuredActivityNode.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Inputpin> getStructuredNodeInput();
	void setStructuredNodeInput(java.util.List<uml.Inputpin> structuredNodeInput);

	@Description("The OutputPins owned by the StructuredActivityNode.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Outputpin> getStructuredNodeOutput();
	void setStructuredNodeOutput(java.util.List<uml.Outputpin> structuredNodeOutput);

	@Description("The Variables defined in the scope of the StructuredActivityNode.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Variable> getVariable();
	void setVariable(java.util.List<uml.Variable> variable);

	@Description("The ActivityNodes immediately contained in the StructuredActivityNode.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Activitynode> getNode();
	void setNode(java.util.List<uml.Activitynode> node);

}

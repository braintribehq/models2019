/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Activity of the Data Model uml.
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
{@link ownedGroup}, 
{@link edge}, 
{@link node}, 
{@link variable}, 
{@link group}, 
{@link ownedNode}, 
{@link isReadOnly}, 
{@link isSingleExecution}, 
{@link partition}, 
{@link structuredNode}, 

* It provides of then following operations (getters and setters)
{@link getOwnedGroup},
{@link getEdge},
{@link getNode},
{@link getVariable},
{@link getGroup},
{@link getOwnedNode},
{@link getIsReadOnly},
{@link getIsSingleExecution},
{@link getPartition},
{@link getStructuredNode},
{@link setOwnedGroup},
{@link setEdge},
{@link setNode},
{@link setVariable},
{@link setGroup},
{@link setOwnedNode},
{@link setIsReadOnly},
{@link setIsSingleExecution},
{@link setPartition},
{@link setStructuredNode},
 */

@Description("An Activity is the specification of parameterized Behavior as the coordinated sequencing of subordinate units.<p>From package UML::Activities.</p>")

public interface Activity extends GenericEntity, uml.Behavior {

	EntityType<Activity> T = EntityTypes.T(Activity.class);

	/* Constants for each property name. */
	java.lang.String ownedGroup = "ownedGroup";
	java.lang.String edge = "edge";
	java.lang.String node = "node";
	java.lang.String variable = "variable";
	java.lang.String group = "group";
	java.lang.String ownedNode = "ownedNode";
	java.lang.String isReadOnly = "isReadOnly";
	java.lang.String isSingleExecution = "isSingleExecution";
	java.lang.String partition = "partition";
	java.lang.String structuredNode = "structuredNode";

	@Description("")
	
	java.util.List<uml.Activitygroup> getOwnedGroup();
	void setOwnedGroup(java.util.List<uml.Activitygroup> ownedGroup);

	@Description("ActivityEdges expressing flow between the nodes of the Activity.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activityedge> getEdge();
	void setEdge(java.util.List<uml.Activityedge> edge);

	@Description("ActivityNodes coordinated by the Activity.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activitynode> getNode();
	void setNode(java.util.List<uml.Activitynode> node);

	@Description("Top-level Variables defined by the Activity.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Variable> getVariable();
	void setVariable(java.util.List<uml.Variable> variable);

	@Description("Top-level ActivityGroups in the Activity.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activitygroup> getGroup();
	void setGroup(java.util.List<uml.Activitygroup> group);

	@Description("")
	
	java.util.List<uml.Activitynode> getOwnedNode();
	void setOwnedNode(java.util.List<uml.Activitynode> ownedNode);

	@Description("If true, this Activity must not make any changes to objects. The default is false (an Activity may make nonlocal changes). (This is an assertion, not an executable property. It may be used by an execution engine to optimize model execution. If the assertion is violated by the Activity, then the model is ill-formed.)<p>From package UML::Activities.</p>")
	@Mandatory
	types.Boolean getIsReadOnly();
	void setIsReadOnly(types.Boolean isReadOnly);
	@Description("If true, all invocations of the Activity are handled by the same execution.<p>From package UML::Activities.</p>")
	@Mandatory
	types.Boolean getIsSingleExecution();
	void setIsSingleExecution(types.Boolean isSingleExecution);
	@Description("Top-level ActivityPartitions in the Activity.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activitypartition> getPartition();
	void setPartition(java.util.List<uml.Activitypartition> partition);

	@Description("Top-level StructuredActivityNodes in the Activity.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Structuredactivitynode> getStructuredNode();
	void setStructuredNode(java.util.List<uml.Structuredactivitynode> structuredNode);

}

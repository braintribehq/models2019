/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Activityedge of the Data Model uml.
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
{@link activity}, 
{@link guard}, 
{@link inPartition}, 
{@link interrupts}, 
{@link inStructuredNode}, 
{@link target}, 
{@link source}, 
{@link redefinedEdge}, 
{@link weight}, 
{@link inGroup}, 

* It provides of then following operations (getters and setters)
{@link getActivity},
{@link getGuard},
{@link getInPartition},
{@link getInterrupts},
{@link getInStructuredNode},
{@link getTarget},
{@link getSource},
{@link getRedefinedEdge},
{@link getWeight},
{@link getInGroup},
{@link setActivity},
{@link setGuard},
{@link setInPartition},
{@link setInterrupts},
{@link setInStructuredNode},
{@link setTarget},
{@link setSource},
{@link setRedefinedEdge},
{@link setWeight},
{@link setInGroup},
 */

@Description("An ActivityEdge is an abstract class for directed connections between two ActivityNodes.<p>From package UML::Activities.</p>")
 
@Abstract 

public interface Activityedge extends GenericEntity, uml.Redefinableelement {

	EntityType<Activityedge> T = EntityTypes.T(Activityedge.class);

	/* Constants for each property name. */
	java.lang.String activity = "activity";
	java.lang.String guard = "guard";
	java.lang.String inPartition = "inPartition";
	java.lang.String interrupts = "interrupts";
	java.lang.String inStructuredNode = "inStructuredNode";
	java.lang.String target = "target";
	java.lang.String source = "source";
	java.lang.String redefinedEdge = "redefinedEdge";
	java.lang.String weight = "weight";
	java.lang.String inGroup = "inGroup";

	@Description("The Activity containing the ActivityEdge, if it is directly owned by an Activity.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Activity getActivity();
	void setActivity(uml.Activity activity);
	@Description("A ValueSpecification that is evaluated to determine if a token can traverse the ActivityEdge. If an ActivityEdge has no guard, then there is no restriction on tokens traversing the edge.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Valuespecification getGuard();
	void setGuard(uml.Valuespecification guard);
	@Description("ActivityPartitions containing the ActivityEdge.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activitypartition> getInPartition();
	void setInPartition(java.util.List<uml.Activitypartition> inPartition);

	@Description("The InterruptibleActivityRegion for which this ActivityEdge is an interruptingEdge.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Interruptibleactivityregion getInterrupts();
	void setInterrupts(uml.Interruptibleactivityregion interrupts);
	@Description("The StructuredActivityNode containing the ActivityEdge, if it is owned by a StructuredActivityNode.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Structuredactivitynode getInStructuredNode();
	void setInStructuredNode(uml.Structuredactivitynode inStructuredNode);
	@Description("The ActivityNode to which tokens are put when they traverse the ActivityEdge.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Activitynode getTarget();
	void setTarget(uml.Activitynode target);
	@Description("The ActivityNode from which tokens are taken when they traverse the ActivityEdge.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Activitynode getSource();
	void setSource(uml.Activitynode source);
	@Description("ActivityEdges from a generalization of the Activity containing this ActivityEdge that are redefined by this ActivityEdge.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activityedge> getRedefinedEdge();
	void setRedefinedEdge(java.util.List<uml.Activityedge> redefinedEdge);

	@Description("The minimum number of tokens that must traverse the ActivityEdge at the same time. If no weight is specified, this is equivalent to specifying a constant value of 1.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Valuespecification getWeight();
	void setWeight(uml.Valuespecification weight);
	@Description("ActivityGroups containing the ActivityEdge.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activitygroup> getInGroup();
	void setInGroup(java.util.List<uml.Activitygroup> inGroup);

}

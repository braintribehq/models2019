/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Activitynode of the Data Model uml.
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
{@link inGroup}, 
{@link inInterruptibleRegion}, 
{@link inStructuredNode}, 
{@link incoming}, 
{@link outgoing}, 
{@link redefinedNode}, 
{@link inPartition}, 

* It provides of then following operations (getters and setters)
{@link getActivity},
{@link getInGroup},
{@link getInInterruptibleRegion},
{@link getInStructuredNode},
{@link getIncoming},
{@link getOutgoing},
{@link getRedefinedNode},
{@link getInPartition},
{@link setActivity},
{@link setInGroup},
{@link setInInterruptibleRegion},
{@link setInStructuredNode},
{@link setIncoming},
{@link setOutgoing},
{@link setRedefinedNode},
{@link setInPartition},
 */

@Description("ActivityNode is an abstract class for points in the flow of an Activity connected by ActivityEdges.<p>From package UML::Activities.</p>")
 
@Abstract 

public interface Activitynode extends GenericEntity, uml.Redefinableelement, uml.Activitycontent {

	EntityType<Activitynode> T = EntityTypes.T(Activitynode.class);

	/* Constants for each property name. */
	java.lang.String activity = "activity";
	java.lang.String inGroup = "inGroup";
	java.lang.String inInterruptibleRegion = "inInterruptibleRegion";
	java.lang.String inStructuredNode = "inStructuredNode";
	java.lang.String incoming = "incoming";
	java.lang.String outgoing = "outgoing";
	java.lang.String redefinedNode = "redefinedNode";
	java.lang.String inPartition = "inPartition";

	@Description("The Activity containing the ActivityNode, if it is directly owned by an Activity.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Activity getActivity();
	void setActivity(uml.Activity activity);
	@Description("ActivityGroups containing the ActivityNode.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activitygroup> getInGroup();
	void setInGroup(java.util.List<uml.Activitygroup> inGroup);

	@Description("InterruptibleActivityRegions containing the ActivityNode.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Interruptibleactivityregion> getInInterruptibleRegion();
	void setInInterruptibleRegion(java.util.List<uml.Interruptibleactivityregion> inInterruptibleRegion);

	@Description("The StructuredActivityNode containing the ActvityNode, if it is directly owned by a StructuredActivityNode.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Structuredactivitynode getInStructuredNode();
	void setInStructuredNode(uml.Structuredactivitynode inStructuredNode);
	@Description("ActivityEdges that have the ActivityNode as their target.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activityedge> getIncoming();
	void setIncoming(java.util.List<uml.Activityedge> incoming);

	@Description("ActivityEdges that have the ActivityNode as their source.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activityedge> getOutgoing();
	void setOutgoing(java.util.List<uml.Activityedge> outgoing);

	@Description("ActivityNodes from a generalization of the Activity containining this ActivityNode that are redefined by this ActivityNode.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activitynode> getRedefinedNode();
	void setRedefinedNode(java.util.List<uml.Activitynode> redefinedNode);

	@Description("ActivityPartitions containing the ActivityNode.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activitypartition> getInPartition();
	void setInPartition(java.util.List<uml.Activitypartition> inPartition);

}

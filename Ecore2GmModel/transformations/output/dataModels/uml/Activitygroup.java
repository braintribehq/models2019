/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Activitygroup of the Data Model uml.
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
{@link containedEdge}, 
{@link containedNode}, 
{@link inActivity}, 
{@link subgroup}, 
{@link superGroup}, 

* It provides of then following operations (getters and setters)
{@link getContainedEdge},
{@link getContainedNode},
{@link getInActivity},
{@link getSubgroup},
{@link getSuperGroup},
{@link setContainedEdge},
{@link setContainedNode},
{@link setInActivity},
{@link setSubgroup},
{@link setSuperGroup},
 */

@Description("ActivityGroup is an abstract class for defining sets of ActivityNodes and ActivityEdges in an Activity.<p>From package UML::Activities.</p>")
 
@Abstract 

public interface Activitygroup extends GenericEntity, uml.Namedelement, uml.Activitycontent {

	EntityType<Activitygroup> T = EntityTypes.T(Activitygroup.class);

	/* Constants for each property name. */
	java.lang.String containedEdge = "containedEdge";
	java.lang.String containedNode = "containedNode";
	java.lang.String inActivity = "inActivity";
	java.lang.String subgroup = "subgroup";
	java.lang.String superGroup = "superGroup";

	@Description("ActivityEdges immediately contained in the ActivityGroup.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activityedge> getContainedEdge();
	void setContainedEdge(java.util.List<uml.Activityedge> containedEdge);

	@Description("ActivityNodes immediately contained in the ActivityGroup.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activitynode> getContainedNode();
	void setContainedNode(java.util.List<uml.Activitynode> containedNode);

	@Description("The Activity containing the ActivityGroup, if it is directly owned by an Activity.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Activity getInActivity();
	void setInActivity(uml.Activity inActivity);
	@Description("Other ActivityGroups immediately contained in this ActivityGroup.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activitygroup> getSubgroup();
	void setSubgroup(java.util.List<uml.Activitygroup> subgroup);

	@Description("The ActivityGroup immediately containing this ActivityGroup, if it is directly owned by another ActivityGroup.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Activitygroup getSuperGroup();
	void setSuperGroup(uml.Activitygroup superGroup);
}

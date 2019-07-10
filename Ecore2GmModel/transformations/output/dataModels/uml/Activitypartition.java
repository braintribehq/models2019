/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Activitypartition of the Data Model uml.
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
{@link isDimension}, 
{@link isExternal}, 
{@link node}, 
{@link represents}, 
{@link subpartition}, 
{@link superPartition}, 
{@link edge}, 

* It provides of then following operations (getters and setters)
{@link getIsDimension},
{@link getIsExternal},
{@link getNode},
{@link getRepresents},
{@link getSubpartition},
{@link getSuperPartition},
{@link getEdge},
{@link setIsDimension},
{@link setIsExternal},
{@link setNode},
{@link setRepresents},
{@link setSubpartition},
{@link setSuperPartition},
{@link setEdge},
 */

@Description("An ActivityPartition is a kind of ActivityGroup for identifying ActivityNodes that have some characteristic in common.<p>From package UML::Activities.</p>")

public interface Activitypartition extends GenericEntity, uml.Activitygroup {

	EntityType<Activitypartition> T = EntityTypes.T(Activitypartition.class);

	/* Constants for each property name. */
	java.lang.String isDimension = "isDimension";
	java.lang.String isExternal = "isExternal";
	java.lang.String node = "node";
	java.lang.String represents = "represents";
	java.lang.String subpartition = "subpartition";
	java.lang.String superPartition = "superPartition";
	java.lang.String edge = "edge";

	@Description("Indicates whether the ActivityPartition groups other ActivityPartitions along a dimension.<p>From package UML::Activities.</p>")
	@Mandatory
	types.Boolean getIsDimension();
	void setIsDimension(types.Boolean isDimension);
	@Description("Indicates whether the ActivityPartition represents an entity to which the partitioning structure does not apply.<p>From package UML::Activities.</p>")
	@Mandatory
	types.Boolean getIsExternal();
	void setIsExternal(types.Boolean isExternal);
	@Description("ActivityNodes immediately contained in the ActivityPartition.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activitynode> getNode();
	void setNode(java.util.List<uml.Activitynode> node);

	@Description("An Element represented by the functionality modeled within the ActivityPartition.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Element getRepresents();
	void setRepresents(uml.Element represents);
	@Description("Other ActivityPartitions immediately contained in this ActivityPartition (as its subgroups).<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activitypartition> getSubpartition();
	void setSubpartition(java.util.List<uml.Activitypartition> subpartition);

	@Description("Other ActivityPartitions immediately containing this ActivityPartition (as its superGroups).<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Activitypartition getSuperPartition();
	void setSuperPartition(uml.Activitypartition superPartition);
	@Description("ActivityEdges immediately contained in the ActivityPartition.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activityedge> getEdge();
	void setEdge(java.util.List<uml.Activityedge> edge);

}

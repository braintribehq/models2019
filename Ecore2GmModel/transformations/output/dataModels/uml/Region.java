/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Region of the Data Model uml.
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
{@link extendedRegion}, 
{@link state}, 
{@link stateMachine}, 
{@link transition}, 
{@link subvertex}, 

* It provides of then following operations (getters and setters)
{@link getExtendedRegion},
{@link getState},
{@link getStateMachine},
{@link getTransition},
{@link getSubvertex},
{@link setExtendedRegion},
{@link setState},
{@link setStateMachine},
{@link setTransition},
{@link setSubvertex},
 */

@Description("A Region is a top-level part of a StateMachine or a composite State, that serves as a container for the Vertices and Transitions of the StateMachine. A StateMachine or composite State may contain multiple Regions representing behaviors that may occur in parallel.<p>From package UML::StateMachines.</p>")

public interface Region extends GenericEntity, uml.Namespace, uml.Redefinableelement {

	EntityType<Region> T = EntityTypes.T(Region.class);

	/* Constants for each property name. */
	java.lang.String extendedRegion = "extendedRegion";
	java.lang.String state = "state";
	java.lang.String stateMachine = "stateMachine";
	java.lang.String transition = "transition";
	java.lang.String subvertex = "subvertex";

	@Description("The region of which this region is an extension.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Region getExtendedRegion();
	void setExtendedRegion(uml.Region extendedRegion);
	@Description("The State that owns the Region. If a Region is owned by a State, then it cannot also be owned by a StateMachine.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.State getState();
	void setState(uml.State state);
	@Description("The StateMachine that owns the Region. If a Region is owned by a StateMachine, then it cannot also be owned by a State.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Statemachine getStateMachine();
	void setStateMachine(uml.Statemachine stateMachine);
	@Description("The set of Transitions owned by the Region.<p>From package UML::StateMachines.</p>")
	
	java.util.List<uml.Transition> getTransition();
	void setTransition(java.util.List<uml.Transition> transition);

	@Description("The set of Vertices that are owned by this Region.<p>From package UML::StateMachines.</p>")
	
	java.util.List<uml.Vertex> getSubvertex();
	void setSubvertex(java.util.List<uml.Vertex> subvertex);

}

/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Protocolconformance of the Data Model uml.
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
{@link generalMachine}, 
{@link specificMachine}, 

* It provides of then following operations (getters and setters)
{@link getGeneralMachine},
{@link getSpecificMachine},
{@link setGeneralMachine},
{@link setSpecificMachine},
 */

@Description("A ProtocolStateMachine can be redefined into a more specific ProtocolStateMachine or into behavioral StateMachine. ProtocolConformance declares that the specific ProtocolStateMachine specifies a protocol that conforms to the general ProtocolStateMachine or that the specific behavioral StateMachine abides by the protocol of the general ProtocolStateMachine.<p>From package UML::StateMachines.</p>")

public interface Protocolconformance extends GenericEntity, uml.Directedrelationship {

	EntityType<Protocolconformance> T = EntityTypes.T(Protocolconformance.class);

	/* Constants for each property name. */
	java.lang.String generalMachine = "generalMachine";
	java.lang.String specificMachine = "specificMachine";

	@Description("Specifies the ProtocolStateMachine to which the specific ProtocolStateMachine conforms.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Protocolstatemachine getGeneralMachine();
	void setGeneralMachine(uml.Protocolstatemachine generalMachine);
	@Description("Specifies the ProtocolStateMachine which conforms to the general ProtocolStateMachine.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Protocolstatemachine getSpecificMachine();
	void setSpecificMachine(uml.Protocolstatemachine specificMachine);
}

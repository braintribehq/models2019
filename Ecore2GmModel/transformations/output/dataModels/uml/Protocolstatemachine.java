/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Protocolstatemachine of the Data Model uml.
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
{@link conformance}, 

* It provides of then following operations (getters and setters)
{@link getConformance},
{@link setConformance},
 */

@Description("A ProtocolStateMachine is always defined in the context of a Classifier. It specifies which BehavioralFeatures of the Classifier can be called in which State and under which conditions, thus specifying the allowed invocation sequences on the Classifier's BehavioralFeatures. A ProtocolStateMachine specifies the possible and permitted Transitions on the instances of its context Classifier, together with the BehavioralFeatures that carry the Transitions. In this manner, an instance lifecycle can be specified for a Classifier, by defining the order in which the BehavioralFeatures can be activated and the States through which an instance progresses during its existence.<p>From package UML::StateMachines.</p>")

public interface Protocolstatemachine extends GenericEntity, uml.Statemachine {

	EntityType<Protocolstatemachine> T = EntityTypes.T(Protocolstatemachine.class);

	/* Constants for each property name. */
	java.lang.String conformance = "conformance";

	@Description("Conformance between ProtocolStateMachine<p>From package UML::StateMachines.</p>")
	
	java.util.List<uml.Protocolconformance> getConformance();
	void setConformance(java.util.List<uml.Protocolconformance> conformance);

}

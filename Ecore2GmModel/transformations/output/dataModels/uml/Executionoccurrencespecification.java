/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Executionoccurrencespecification of the Data Model uml.
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
{@link execution}, 

* It provides of then following operations (getters and setters)
{@link getExecution},
{@link setExecution},
 */

@Description("An ExecutionOccurrenceSpecification represents moments in time at which Actions or Behaviors start or finish.<p>From package UML::Interactions.</p>")

public interface Executionoccurrencespecification extends GenericEntity, uml.Occurrencespecification {

	EntityType<Executionoccurrencespecification> T = EntityTypes.T(Executionoccurrencespecification.class);

	/* Constants for each property name. */
	java.lang.String execution = "execution";

	@Description("References the execution specification describing the execution that is started or finished at this execution event.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Executionspecification getExecution();
	void setExecution(uml.Executionspecification execution);
}

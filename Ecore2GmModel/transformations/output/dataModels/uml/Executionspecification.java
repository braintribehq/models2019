/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Executionspecification of the Data Model uml.
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
{@link finish}, 
{@link start}, 

* It provides of then following operations (getters and setters)
{@link getFinish},
{@link getStart},
{@link setFinish},
{@link setStart},
 */

@Description("An ExecutionSpecification is a specification of the execution of a unit of Behavior or Action within the Lifeline. The duration of an ExecutionSpecification is represented by two OccurrenceSpecifications, the start OccurrenceSpecification and the finish OccurrenceSpecification.<p>From package UML::Interactions.</p>")
 
@Abstract 

public interface Executionspecification extends GenericEntity, uml.Interactionfragment {

	EntityType<Executionspecification> T = EntityTypes.T(Executionspecification.class);

	/* Constants for each property name. */
	java.lang.String finish = "finish";
	java.lang.String start = "start";

	@Description("References the OccurrenceSpecification that designates the finish of the Action or Behavior.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Occurrencespecification getFinish();
	void setFinish(uml.Occurrencespecification finish);
	@Description("References the OccurrenceSpecification that designates the start of the Action or Behavior.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Occurrencespecification getStart();
	void setStart(uml.Occurrencespecification start);
}

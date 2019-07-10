/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Include of the Data Model uml.
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
{@link addition}, 
{@link includingCase}, 

* It provides of then following operations (getters and setters)
{@link getAddition},
{@link getIncludingCase},
{@link setAddition},
{@link setIncludingCase},
 */

@Description("An Include relationship specifies that a UseCase contains the behavior defined in another UseCase.<p>From package UML::UseCases.</p>")

public interface Include extends GenericEntity, uml.Namedelement, uml.Directedrelationship {

	EntityType<Include> T = EntityTypes.T(Include.class);

	/* Constants for each property name. */
	java.lang.String addition = "addition";
	java.lang.String includingCase = "includingCase";

	@Description("The UseCase that is to be included.<p>From package UML::UseCases.</p>")
	@Mandatory
	uml.Usecase getAddition();
	void setAddition(uml.Usecase addition);
	@Description("The UseCase which includes the addition and owns the Include relationship.<p>From package UML::UseCases.</p>")
	@Mandatory
	uml.Usecase getIncludingCase();
	void setIncludingCase(uml.Usecase includingCase);
}

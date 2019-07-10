/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Extensionpoint of the Data Model uml.
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
{@link useCase}, 

* It provides of then following operations (getters and setters)
{@link getUseCase},
{@link setUseCase},
 */

@Description("An ExtensionPoint identifies a point in the behavior of a UseCase where that behavior can be extended by the behavior of some other (extending) UseCase, as specified by an Extend relationship.<p>From package UML::UseCases.</p>")

public interface Extensionpoint extends GenericEntity, uml.Redefinableelement {

	EntityType<Extensionpoint> T = EntityTypes.T(Extensionpoint.class);

	/* Constants for each property name. */
	java.lang.String useCase = "useCase";

	@Description("The UseCase that owns this ExtensionPoint.<p>From package UML::UseCases.</p>")
	@Mandatory
	uml.Usecase getUseCase();
	void setUseCase(uml.Usecase useCase);
}

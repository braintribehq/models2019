/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Extend of the Data Model uml.
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
{@link condition}, 
{@link extendedCase}, 
{@link extensionLocation}, 
{@link extension}, 

* It provides of then following operations (getters and setters)
{@link getCondition},
{@link getExtendedCase},
{@link getExtensionLocation},
{@link getExtension},
{@link setCondition},
{@link setExtendedCase},
{@link setExtensionLocation},
{@link setExtension},
 */

@Description("A relationship from an extending UseCase to an extended UseCase that specifies how and when the behavior defined in the extending UseCase can be inserted into the behavior defined in the extended UseCase.<p>From package UML::UseCases.</p>")

public interface Extend extends GenericEntity, uml.Namedelement, uml.Directedrelationship {

	EntityType<Extend> T = EntityTypes.T(Extend.class);

	/* Constants for each property name. */
	java.lang.String condition = "condition";
	java.lang.String extendedCase = "extendedCase";
	java.lang.String extensionLocation = "extensionLocation";
	java.lang.String extension = "extension";

	@Description("References the condition that must hold when the first ExtensionPoint is reached for the extension to take place. If no constraint is associated with the Extend relationship, the extension is unconditional.<p>From package UML::UseCases.</p>")
	@Mandatory
	uml.Constraint getCondition();
	void setCondition(uml.Constraint condition);
	@Description("The UseCase that is being extended.<p>From package UML::UseCases.</p>")
	@Mandatory
	uml.Usecase getExtendedCase();
	void setExtendedCase(uml.Usecase extendedCase);
	@Description("An ordered list of ExtensionPoints belonging to the extended UseCase, specifying where the respective behavioral fragments of the extending UseCase are to be inserted. The first fragment in the extending UseCase is associated with the first extension point in the list, the second fragment with the second point, and so on. Note that, in most practical cases, the extending UseCase has just a single behavior fragment, so that the list of ExtensionPoints is trivial.<p>From package UML::UseCases.</p>")
	
	java.util.List<uml.Extensionpoint> getExtensionLocation();
	void setExtensionLocation(java.util.List<uml.Extensionpoint> extensionLocation);

	@Description("The UseCase that represents the extension and owns the Extend relationship.<p>From package UML::UseCases.</p>")
	@Mandatory
	uml.Usecase getExtension();
	void setExtension(uml.Usecase extension);
}

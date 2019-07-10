/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Component of the Data Model uml.
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
{@link isIndirectlyInstantiated}, 
{@link packagedElement}, 
{@link provided}, 
{@link realization}, 
{@link required}, 

* It provides of then following operations (getters and setters)
{@link getIsIndirectlyInstantiated},
{@link getPackagedElement},
{@link getProvided},
{@link getRealization},
{@link getRequired},
{@link setIsIndirectlyInstantiated},
{@link setPackagedElement},
{@link setProvided},
{@link setRealization},
{@link setRequired},
 */

@Description("A Component represents a modular part of a system that encapsulates its contents and whose manifestation is replaceable within its environment.<p>From package UML::StructuredClassifiers.</p>")

public interface Component extends GenericEntity, uml.Class {

	EntityType<Component> T = EntityTypes.T(Component.class);

	/* Constants for each property name. */
	java.lang.String isIndirectlyInstantiated = "isIndirectlyInstantiated";
	java.lang.String packagedElement = "packagedElement";
	java.lang.String provided = "provided";
	java.lang.String realization = "realization";
	java.lang.String required = "required";

	@Description("If true, the Component is defined at design-time, but at run-time (or execution-time) an object specified by the Component does not exist, that is, the Component is instantiated indirectly, through the instantiation of its realizing Classifiers or parts.<p>From package UML::StructuredClassifiers.</p>")
	@Mandatory
	types.Boolean getIsIndirectlyInstantiated();
	void setIsIndirectlyInstantiated(types.Boolean isIndirectlyInstantiated);
	@Description("The set of PackageableElements that a Component owns. In the namespace of a Component, all model elements that are involved in or related to its definition may be owned or imported explicitly. These may include e.g., Classes, Interfaces, Components, Packages, UseCases, Dependencies (e.g., mappings), and Artifacts.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Packageableelement> getPackagedElement();
	void setPackagedElement(java.util.List<uml.Packageableelement> packagedElement);

	@Description("The Interfaces that the Component exposes to its environment. These Interfaces may be Realized by the Component or any of its realizingClassifiers, or they may be the Interfaces that are provided by its public Ports.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Interface> getProvided();
	void setProvided(java.util.List<uml.Interface> provided);

	@Description("The set of Realizations owned by the Component. Realizations reference the Classifiers of which the Component is an abstraction; i.e., that realize its behavior.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Componentrealization> getRealization();
	void setRealization(java.util.List<uml.Componentrealization> realization);

	@Description("The Interfaces that the Component requires from other Components in its environment in order to be able to offer its full set of provided functionality. These Interfaces may be used by the Component or any of its realizingClassifiers, or they may be the Interfaces that are required by its public Ports.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Interface> getRequired();
	void setRequired(java.util.List<uml.Interface> required);

}

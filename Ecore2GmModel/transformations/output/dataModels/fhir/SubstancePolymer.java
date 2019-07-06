/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstancePolymer of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link class_}, 
{@link geometry}, 
{@link copolymerConnectivity}, 
{@link monomerSet}, 
{@link repeat}, 

* It provides of then following operations (getters and setters)
{@link getClass_},
{@link getGeometry},
{@link getCopolymerConnectivity},
{@link getMonomerSet},
{@link getRepeat},
{@link setClass_},
{@link setGeometry},
{@link setCopolymerConnectivity},
{@link setMonomerSet},
{@link setRepeat},
 */

@Description("Todo.If the element is present, it must have either a @value, an @id, or extensions")

public interface SubstancePolymer extends GenericEntity, fhir.FhirDomainResource {

	EntityType<SubstancePolymer> T = EntityTypes.T(SubstancePolymer.class);

	/* Constants for each property name. */
	java.lang.String class_ = "class_";
	java.lang.String geometry = "geometry";
	java.lang.String copolymerConnectivity = "copolymerConnectivity";
	java.lang.String monomerSet = "monomerSet";
	java.lang.String repeat = "repeat";

	@Description("Todo.")
	@Mandatory
	fhir.CodeableConcept getClass_();
	void setClass_(fhir.CodeableConcept class_);
	@Description("Todo.")
	@Mandatory
	fhir.CodeableConcept getGeometry();
	void setGeometry(fhir.CodeableConcept geometry);
	@Description("Todo.")
	
	java.util.List<fhir.CodeableConcept> getCopolymerConnectivity();
	void setCopolymerConnectivity(java.util.List<fhir.CodeableConcept> copolymerConnectivity);

	@Description("Todo.")
	
	java.util.List<fhir.SubstancePolymerMonomerSet> getMonomerSet();
	void setMonomerSet(java.util.List<fhir.SubstancePolymerMonomerSet> monomerSet);

	@Description("Todo.")
	
	java.util.List<fhir.SubstancePolymerRepeat> getRepeat();
	void setRepeat(java.util.List<fhir.SubstancePolymerRepeat> repeat);

}

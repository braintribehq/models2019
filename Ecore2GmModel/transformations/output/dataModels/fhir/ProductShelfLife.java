/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ProductShelfLife of the Data Model fhir.
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
{@link identifier}, 
{@link type}, 
{@link period}, 
{@link specialPrecautionsForStorage}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
{@link getPeriod},
{@link getSpecialPrecautionsForStorage},
{@link setIdentifier},
{@link setType},
{@link setPeriod},
{@link setSpecialPrecautionsForStorage},
 */

@Description("The shelf-life and storage information for a medicinal product item or container can be described using this class.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface ProductShelfLife extends GenericEntity, fhir.BackboneElement {

	EntityType<ProductShelfLife> T = EntityTypes.T(ProductShelfLife.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String period = "period";
	java.lang.String specialPrecautionsForStorage = "specialPrecautionsForStorage";

	@Description("Unique identifier for the packaged Medicinal Product.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("This describes the shelf life, taking into account various scenarios such as shelf life of the packaged Medicinal Product itself, shelf life after transformation where necessary and shelf life after the first opening of a bottle, etc. The shelf life type shall be specified using an appropriate controlled vocabulary The controlled term and the controlled term identifier shall be specified.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The shelf life time period can be specified using a numerical value for the period of time and its unit of time measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.")
	@Mandatory
	fhir.Quantity getPeriod();
	void setPeriod(fhir.Quantity period);
	@Description("Special precautions for storage, if any, can be specified using an appropriate controlled vocabulary The controlled term and the controlled term identifier shall be specified.")
	
	java.util.List<fhir.CodeableConcept> getSpecialPrecautionsForStorage();
	void setSpecialPrecautionsForStorage(java.util.List<fhir.CodeableConcept> specialPrecautionsForStorage);

}

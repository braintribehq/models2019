/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ProdCharacteristic of the Data Model fhir.
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
{@link height}, 
{@link width}, 
{@link depth}, 
{@link weight}, 
{@link nominalVolume}, 
{@link externalDiameter}, 
{@link image}, 
{@link scoring}, 

* It provides of then following operations (getters and setters)
{@link getHeight},
{@link getWidth},
{@link getDepth},
{@link getWeight},
{@link getNominalVolume},
{@link getExternalDiameter},
{@link getImage},
{@link getScoring},
{@link setHeight},
{@link setWidth},
{@link setDepth},
{@link setWeight},
{@link setNominalVolume},
{@link setExternalDiameter},
{@link setImage},
{@link setScoring},
 */

@Description("The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface ProdCharacteristic extends GenericEntity, fhir.BackboneElement {

	EntityType<ProdCharacteristic> T = EntityTypes.T(ProdCharacteristic.class);

	/* Constants for each property name. */
	java.lang.String height = "height";
	java.lang.String width = "width";
	java.lang.String depth = "depth";
	java.lang.String weight = "weight";
	java.lang.String nominalVolume = "nominalVolume";
	java.lang.String externalDiameter = "externalDiameter";
	java.lang.String image = "image";
	java.lang.String scoring = "scoring";

	@Description("Where applicable, the height can be specified using a numerical value and its unit of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.")
	@Mandatory
	fhir.Quantity getHeight();
	void setHeight(fhir.Quantity height);
	@Description("Where applicable, the width can be specified using a numerical value and its unit of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.")
	@Mandatory
	fhir.Quantity getWidth();
	void setWidth(fhir.Quantity width);
	@Description("Where applicable, the depth can be specified using a numerical value and its unit of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.")
	@Mandatory
	fhir.Quantity getDepth();
	void setDepth(fhir.Quantity depth);
	@Description("Where applicable, the weight can be specified using a numerical value and its unit of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.")
	@Mandatory
	fhir.Quantity getWeight();
	void setWeight(fhir.Quantity weight);
	@Description("Where applicable, the nominal volume can be specified using a numerical value and its unit of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.")
	@Mandatory
	fhir.Quantity getNominalVolume();
	void setNominalVolume(fhir.Quantity nominalVolume);
	@Description("Where applicable, the external diameter can be specified using a numerical value and its unit of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.")
	@Mandatory
	fhir.Quantity getExternalDiameter();
	void setExternalDiameter(fhir.Quantity externalDiameter);
	@Description("Where applicable, the image can be provided The format of the image attachment shall be specified by regional implementations.")
	
	java.util.List<fhir.Attachment> getImage();
	void setImage(java.util.List<fhir.Attachment> image);

	@Description("Where applicable, the scoring can be specified An appropriate controlled vocabulary shall be used The term and the term identifier shall be used.")
	@Mandatory
	fhir.CodeableConcept getScoring();
	void setScoring(fhir.CodeableConcept scoring);
}

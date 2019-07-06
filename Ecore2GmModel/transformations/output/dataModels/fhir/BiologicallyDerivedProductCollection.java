/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type BiologicallyDerivedProductCollection of the Data Model fhir.
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
{@link collector}, 
{@link source}, 
{@link collectedPeriod}, 

* It provides of then following operations (getters and setters)
{@link getCollector},
{@link getSource},
{@link getCollectedPeriod},
{@link setCollector},
{@link setSource},
{@link setCollectedPeriod},
 */

@Description("A material substance originating from a biological entity intended to be transplanted or infusedinto another (possibly the same) biological entity.")

public interface BiologicallyDerivedProductCollection extends GenericEntity, fhir.BackboneElement {

	EntityType<BiologicallyDerivedProductCollection> T = EntityTypes.T(BiologicallyDerivedProductCollection.class);

	/* Constants for each property name. */
	java.lang.String collector = "collector";
	java.lang.String source = "source";
	java.lang.String collectedPeriod = "collectedPeriod";

	@Description("Healthcare professional who is performing the collection.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getCollector();
	void setCollector(com.braintribe.model.generic.GenericEntity collector);
	@Description("The patient or entity, such as a hospital or vendor in the case of a processed/manipulated/manufactured product, providing the product.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSource();
	void setSource(com.braintribe.model.generic.GenericEntity source);
	@Description("")
	@Mandatory
	fhir.Period getCollectedPeriod();
	void setCollectedPeriod(fhir.Period collectedPeriod);
}

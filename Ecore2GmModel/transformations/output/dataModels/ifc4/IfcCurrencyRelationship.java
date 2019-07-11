/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCurrencyRelationship of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link RelatingMonetaryUnit}, 
{@link RelatedMonetaryUnit}, 
{@link ExchangeRate}, 
{@link ExchangeRateAsString}, 
{@link RateDateTime}, 
{@link RateSource}, 

* It provides of then following operations (getters and setters)
{@link getRelatingMonetaryUnit},
{@link getRelatedMonetaryUnit},
{@link getExchangeRate},
{@link getExchangeRateAsString},
{@link getRateDateTime},
{@link getRateSource},
{@link setRelatingMonetaryUnit},
{@link setRelatedMonetaryUnit},
{@link setExchangeRate},
{@link setExchangeRateAsString},
{@link setRateDateTime},
{@link setRateSource},
 */

@Description("")

public interface IfcCurrencyRelationship extends GenericEntity, ifc4.IfcResourceLevelRelationship {

	EntityType<IfcCurrencyRelationship> T = EntityTypes.T(IfcCurrencyRelationship.class);

	/* Constants for each property name. */
	java.lang.String RelatingMonetaryUnit = "RelatingMonetaryUnit";
	java.lang.String RelatedMonetaryUnit = "RelatedMonetaryUnit";
	java.lang.String ExchangeRate = "ExchangeRate";
	java.lang.String ExchangeRateAsString = "ExchangeRateAsString";
	java.lang.String RateDateTime = "RateDateTime";
	java.lang.String RateSource = "RateSource";

	@Description("")
	@Mandatory
	ifc4.IfcMonetaryUnit getRelatingMonetaryUnit();
	void setRelatingMonetaryUnit(ifc4.IfcMonetaryUnit RelatingMonetaryUnit);
	@Description("")
	@Mandatory
	ifc4.IfcMonetaryUnit getRelatedMonetaryUnit();
	void setRelatedMonetaryUnit(ifc4.IfcMonetaryUnit RelatedMonetaryUnit);
	@Description("")
	@Mandatory
	java.lang.Double getExchangeRate();
	void setExchangeRate(java.lang.Double ExchangeRate);
	@Description("")
	@Mandatory
	java.lang.String getExchangeRateAsString();
	void setExchangeRateAsString(java.lang.String ExchangeRateAsString);
	@Description("")
	@Mandatory
	java.lang.String getRateDateTime();
	void setRateDateTime(java.lang.String RateDateTime);
	@Description("")
	@Mandatory
	ifc4.IfcLibraryInformation getRateSource();
	void setRateSource(ifc4.IfcLibraryInformation RateSource);
}

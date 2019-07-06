/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type DeviceMetric of the Data Model fhir.
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
{@link unit}, 
{@link source}, 
{@link parent}, 
{@link measurementPeriod}, 
{@link calibration}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
{@link getUnit},
{@link getSource},
{@link getParent},
{@link getMeasurementPeriod},
{@link getCalibration},
{@link setIdentifier},
{@link setType},
{@link setUnit},
{@link setSource},
{@link setParent},
{@link setMeasurementPeriod},
{@link setCalibration},
 */

@Description("Describes a measurement, calculation or setting capability of a medical device.If the element is present, it must have either a @value, an @id, or extensions")

public interface DeviceMetric extends GenericEntity, fhir.FhirDomainResource {

	EntityType<DeviceMetric> T = EntityTypes.T(DeviceMetric.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String unit = "unit";
	java.lang.String source = "source";
	java.lang.String parent = "parent";
	java.lang.String measurementPeriod = "measurementPeriod";
	java.lang.String calibration = "calibration";

	@Description("Unique instance identifiers assigned to a device by the device or gateway software, manufacturers, other organizations or owners. For example: handle ID.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.")
	@Mandatory
	fhir.CodeableConcept getUnit();
	void setUnit(fhir.CodeableConcept unit);
	@Description("Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacturer, serial number, etc.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSource();
	void setSource(com.braintribe.model.generic.GenericEntity source);
	@Description("Describes the link to the  Device that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a Device that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getParent();
	void setParent(com.braintribe.model.generic.GenericEntity parent);
	@Description("Describes the measurement repetition time. This is not necessarily the same as the update period. The measurement repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP that is triggered automatically every hour. The update period may be different than the measurement repetition time, if the device does not update the published observed value with the same frequency as it was measured.")
	@Mandatory
	fhir.Timing getMeasurementPeriod();
	void setMeasurementPeriod(fhir.Timing measurementPeriod);
	@Description("Describes the calibrations that have been performed or that are required to be performed.")
	
	java.util.List<fhir.DeviceMetricCalibration> getCalibration();
	void setCalibration(java.util.List<fhir.DeviceMetricCalibration> calibration);

}

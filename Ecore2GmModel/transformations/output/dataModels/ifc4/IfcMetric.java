/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcMetric of the Data Model iai.
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
{@link Benchmark}, 
{@link ValueSource}, 
{@link DataValue}, 
{@link ReferencePath}, 

* It provides of then following operations (getters and setters)
{@link getBenchmark},
{@link getValueSource},
{@link getDataValue},
{@link getReferencePath},
{@link setBenchmark},
{@link setValueSource},
{@link setDataValue},
{@link setReferencePath},
 */

@Description("")

public interface IfcMetric extends GenericEntity, ifc4.IfcConstraint {

	EntityType<IfcMetric> T = EntityTypes.T(IfcMetric.class);

	/* Constants for each property name. */
	java.lang.String Benchmark = "Benchmark";
	java.lang.String ValueSource = "ValueSource";
	java.lang.String DataValue = "DataValue";
	java.lang.String ReferencePath = "ReferencePath";

	@Description("")
	@Mandatory
	ifc4.IfcBenchmarkEnum getBenchmark();
	void setBenchmark(ifc4.IfcBenchmarkEnum Benchmark);
	@Description("")
	@Mandatory
	java.lang.String getValueSource();
	void setValueSource(java.lang.String ValueSource);
	@Description("")
	@Mandatory
	ifc4.IfcMetricValueSelect getDataValue();
	void setDataValue(ifc4.IfcMetricValueSelect DataValue);
	@Description("")
	@Mandatory
	ifc4.IfcReference getReferencePath();
	void setReferencePath(ifc4.IfcReference ReferencePath);
}

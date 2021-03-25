package tg.connector.sdk.logging;

import java.time.Instant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.MDC;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

import lombok.Getter;

public class EventLogger {

	private static final Logger LOGGER = LogManager.getLogger(EventLogger.class);
	private static final Logger EVENT_LOGGER = LogManager.getLogger("event");

	EventLogger() {

	}

	private static final ObjectMapper mapper = new ObjectMapper().findAndRegisterModules()
			.registerModule(new ParameterNamesModule(JsonCreator.Mode.PROPERTIES))
			.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
			.setSerializationInclusion(Include.NON_NULL)
			.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

	public static void log(EventType event, String clazz, String refKey, String refValue) {

		try {
			String eventJson = mapper.writeValueAsString(new Event(event, clazz, refKey, refValue));
			EVENT_LOGGER.info(eventJson);
		} catch (JsonProcessingException e) {
			LOGGER.error("Failed to log event due to problem serializing to json", e);
		}
	}

	static class Event {

		@Getter
		private final String serviceName;
		@Getter
		private final String caller;
		@Getter
		private final String traceId;
		@Getter
		private final String spanId;
		@Getter
		private final EventType eventType;
		@Getter
		private final String refKey;
		@Getter
		private final String refValue;

		@Getter
		private final Instant createdAt = Instant.now();

		public Event(EventType eventType, String caller, String refKey, String refValue) {

			this.caller = caller;
			this.traceId = MDC.get("traceId");
			this.spanId = MDC.get("spanId");
			this.serviceName = "bobf-connector-bank";
			this.eventType = eventType;
			this.refKey = refKey;
			this.refValue = refValue;
		}

	}

}
package com.kraken.runtime.client;

import com.kraken.runtime.entity.ContainerStatus;
import com.kraken.runtime.entity.Task;
import reactor.core.publisher.Mono;

import java.util.function.Predicate;

public interface RuntimeClient {

  Mono<Task> waitForPredicate(Predicate<Task> predicate);

  Mono<Task> waitForStatus(String taskId, ContainerStatus status);

  Mono<Void> setStatus(String taskId, String hostname, String containerId, ContainerStatus status);

}

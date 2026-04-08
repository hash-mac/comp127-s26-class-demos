package _0408_api;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.ChatModel;
import com.openai.models.responses.Response;
import com.openai.models.responses.ResponseCreateParams;

// source: https://github.com/openai/openai-java?tab=readme-ov-file
public class OpenAiTest {
    public static void main(String[] args) throws IOException {
        String filePath = "../../hashcx/api-keys/openai.key";
        String apiKey = Files.readString(Path.of(filePath)).trim();
        
        OpenAIClient client = OpenAIOkHttpClient.builder()
            .apiKey(apiKey)
            .build();

        ResponseCreateParams params = ResponseCreateParams.builder()
                .input("Say this is a test")
                .model(ChatModel.O3)
                .build();

        Response response = client.responses().create(params);
        System.out.println(response.output());
    }
}
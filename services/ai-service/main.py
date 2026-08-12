from fastapi import FastAPI
from pydantic import BaseModel

app = FastAPI(
    title="AI Service",
    version="1.0.0"
)


class RecommendationRequest(BaseModel):
    user_id: int
    product: str


@app.get("/api/ai/health")
def health():
    return {
        "service": "ai-service",
        "status": "UP"
    }


@app.post("/api/ai/recommend")
def recommend(request: RecommendationRequest):
    return {
        "user_id": request.user_id,
        "product": request.product,
        "recommendation": (
            f"Customers interested in {request.product} "
            "may also like related accessories."
        ),
        "ai_provider": "placeholder"
    }
